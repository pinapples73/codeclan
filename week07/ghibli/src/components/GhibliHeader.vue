<template>
  <div id='title-image'>
    <img id='logo' src="https://upload.wikimedia.org/wikipedia/en/thumb/c/ca/Studio_Ghibli_logo.svg/1200px-Studio_Ghibli_logo.svg.png" alt="">

  </div>
</template>

<script>
export default {
  name: "ghibli-header",
  props: ["title"]
};
</script>

<style scoped>
  #title-image{
    display:flex;
    justify-content: center;
  }
  #logo {
    height: 200px;
    width: auto;
    background: transparent;
    padding:10px;
  }
</style>
