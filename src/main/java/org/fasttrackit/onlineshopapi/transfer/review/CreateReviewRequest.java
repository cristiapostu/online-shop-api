package org.fasttrackit.onlineshopapi.transfer.review;

public class CreateReviewRequest {


    private String Content;
    private long productId;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "CreateReviewRequest{" +
                "Content='" + Content + '\'' +
                ", productId=" + productId +
                '}';
    }
}
