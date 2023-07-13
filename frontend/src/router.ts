import { createRouter,createWebHistory } from 'vue-router';
import Top from "./components/pages/Top.vue";
import ItemRegist from "./components/pages/ItemRegist.vue";
import ItemConfirm from "./components/pages/ItemConfirm.vue";

const routes = [
    { path: '/', name: 'top', component: Top },
    { path: '/regist', name: 'itemRegist', component: ItemRegist },
    { path: '/confirm', name: 'itemConfirm', component: ItemConfirm },
]

const router = createRouter({
    history: createWebHistory(),
    routes,
})

export default router;
