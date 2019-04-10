package com.example.wushuangling20190407.bean;

import java.util.List;


public class JsonBean {

    /**
     * result : [{"commodityId":153,"commodityName":"红蜻蜓季系带布洛克雕花牛皮革男士英伦商务正装皮鞋绅士商务鞋男士皮鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/px/5/1.jpg","price":239,"saleNum":0},{"commodityId":150,"commodityName":"秋季真皮系带男款婚鞋尖头英伦男士正装商务鞋男鞋男士皮鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/px/2/1.jpg","price":328,"saleNum":0},{"commodityId":158,"commodityName":"系带商务鞋休闲鞋皮鞋棉鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/swxxx/3/1.jpg","price":99,"saleNum":0},{"commodityId":155,"commodityName":"AUXTUN男鞋韩版商务典雅尖头男士皮鞋潮流英伦系带正装休闲皮鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/px/7/1.jpg","price":129,"saleNum":0},{"commodityId":136,"commodityName":"板鞋休闲鞋男男士休闲运动鞋男士鞋子休闲皮鞋男士休闲鞋男鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/nbx/2/1.jpg","price":99,"saleNum":0},{"commodityId":152,"commodityName":"皮鞋男真皮黑色透气男士休闲皮鞋男鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/px/4/1.jpg","price":119,"saleNum":0},{"commodityId":157,"commodityName":"舒适百搭套脚商务休闲鞋男士皮鞋男鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/swxxx/2/1.jpg","price":249,"saleNum":0},{"commodityId":149,"commodityName":"新品蛇纹商务正装系带皮鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/px/1/1.jpg","price":258,"saleNum":0},{"commodityId":154,"commodityName":"三接头秋冬男鞋 布洛克商务休闲皮鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/px/6/1.jpg","price":469,"saleNum":0},{"commodityId":151,"commodityName":"明星同款西装商务皮鞋男韩版潮真皮头层牛皮系带英伦正装鞋布洛克雕花男鞋男士皮鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/px/3/1.jpg","price":498,"saleNum":0}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * commodityId : 153
         * commodityName : 红蜻蜓季系带布洛克雕花牛皮革男士英伦商务正装皮鞋绅士商务鞋男士皮鞋
         * masterPic : http://172.17.8.100/images/small/commodity/nx/px/5/1.jpg
         * price : 239
         * saleNum : 0
         */

        private int commodityId;
        private String commodityName;
        private String masterPic;
        private int price;
        private int saleNum;

        public int getCommodityId() {
            return commodityId;
        }

        public void setCommodityId(int commodityId) {
            this.commodityId = commodityId;
        }

        public String getCommodityName() {
            return commodityName;
        }

        public void setCommodityName(String commodityName) {
            this.commodityName = commodityName;
        }

        public String getMasterPic() {
            return masterPic;
        }

        public void setMasterPic(String masterPic) {
            this.masterPic = masterPic;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getSaleNum() {
            return saleNum;
        }

        public void setSaleNum(int saleNum) {
            this.saleNum = saleNum;
        }
    }
}
