package com.ssgh.myblog.entity;

public class BlogTagCount {

    private Integer tagId;

    private String tagName;

    private Integer tagCount;

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public Integer getTagCount() {
        return tagCount;
    }

    public void setTagCount(Integer tagCount) {
        this.tagCount = tagCount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BlogTagCount{");
        sb.append("tagId=").append(tagId);
        sb.append(", tagName='").append(tagName).append('\'');
        sb.append(", tagCount=").append(tagCount);
        sb.append('}');
        return sb.toString();
    }
}
