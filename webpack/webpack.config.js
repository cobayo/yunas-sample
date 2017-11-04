/**
 * webpack.config.js
 *
 * by yosuke_kobayashi@r.recruit.co.jp
 */
const webpack = require('webpack')
const { basename, dirname, join, relative, resolve } = require('path')
const { sync } = require('glob')
const extname = require('path-complete-extname')
const sourcePath = "../src/javascript/packs/"
const publicPath = "../src/main/resources/static/packs/"


module.exports = {
    entry: getEntryPointMap(),
    output: {
        filename: '[name].js',
        path: resolve(publicPath)
    },
    module: {
        loaders: [
            {
                test: /\.js$/,
                exclude: /node_modules/,
                loader: 'babel-loader'
            },
            {
                test: /\.vue$/,
                exclude: /node_modules/,
                loader: 'vue-loader'
            },
            {
                test: /\.css$/,
                loader: 'css-loader'
            },
            {
                test: /\.(jpg|png)$/,
                loaders: 'url-loader'
            }

        ]
    },
    plugins: [
        new webpack.optimize.CommonsChunkPlugin({
            name: 'vendor',
            chunks: getEntryPoints(),
        }),
    ],
    resolve: {
        extensions: [ '.js','.css','.png','.jpg'],
        modules: [
            resolve('node_modules')
        ],
        alias: {
            'vue$': 'vue/dist/vue.common.js'
        }
    },
    resolveLoader: {
        modules: [ resolve('node_modules') ]
    }
}

function getEntryPointMap() {

    return sync(resolve(sourcePath, '*.js*')).reduce(
        (map, entry) => {
        base = basename(entry, extname(entry))
        map[base] = resolve(entry)
        return map
    }, {}
);
}

function getEntryPoints() {
    return sync(resolve(sourcePath, '*.js*'));
}