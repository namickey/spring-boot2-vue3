<script setup lang="ts">
import {ref, inject} from 'vue';
import {type Item} from '../components/Item.vue'

const item = ref<Item>();
//item.value = {id:null, itemName:"", price:null, groupid:"", registDate:""}
item.value = inject<Item>('item');
const onClick = () => {
  console.log(item.value?.id);
  console.log(item.value?.price);
}
</script>

<template>
  <h1>item確認画面</h1>
    
  <router-link to="/">TOP画面へ</router-link>
  <form>
    <div>
      <label>
        ID
        <input type="text" v-model="item.id" />
      </label>
    </div>
    <div>
      <label>
        price
        <input type="text" v-model="item.price" />
      </label>
    </div>
    <div>
      <button type="button" @click="onClick">登録</button>
    </div>
  </form>
</template>