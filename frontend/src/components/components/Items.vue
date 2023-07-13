<script setup lang="ts">
    import {ref} from 'vue';
    import {type Item} from './Item.vue'
    const items = ref<Item[]>([]);
    const fetchItem = async () => {
        const res = await fetch('http://localhost:8090/items');
        items.value = await res.json();
        console.log(items.value);
    };
    fetchItem();
</script>

<template>
  <ul>
    <li v-for="item in items">
      {{ item.id}}
      {{ item.itemName }}
      :
      {{ item.price }}円
    </li>
  </ul>
</template>
