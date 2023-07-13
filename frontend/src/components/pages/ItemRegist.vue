<script setup lang="ts">
import {ref, provide, defineComponent} from 'vue';
import {type Item} from '../components/Item.vue'
import {useRouter} from 'vue-router';
const router = useRouter();
const item = ref<Item>();
item.value = {id:null, itemName:"", price:null, groupid:"", registDate:""}

const onClick = () => {
  console.log(item.value?.id);
  console.log(item.value?.price);
  provide("item", item);
  router.push('/confirm');
}
</script>

<template>
  <h1>item登録画面</h1>
    
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
      <button type="button" @click="onClick">確認</button>
    </div>
  </form>
</template>