<script setup lang="ts">
import Items from '../components/Items.vue'
</script>

<template>
  <h1>TOP画面</h1>
    <div>
      <Items />
    </div>
    <router-link to="/regist">登録画面</router-link>
</template>
