<template>
<p>{{ message }} World</p>
</template>

<script>
    export default {

        data : function() {

            return {
                message : "Hello"
            }

        },
        name : 'app'

    }

</script>

<style scoped>
    p {
        font-size : 2em
    }

</style>