<template>
  <img id='logo' src="https://12ax7web.s3.amazonaws.com/accounts/1/collections/imported/Adventure-Time_Banner.jpg" alt="">
</template>

<script>
export default {
  name: "at-header",
  props: ["title"]
};
</script>

<style scoped>
  #logo {
    height: 200px;
    background: transparent;
    /* width: 200px; */
  }
</style>
