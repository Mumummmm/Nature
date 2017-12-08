package com.pansy;

public class DefaultBlogService {
    private BlogDao blogDao;

    public void setBlogDao(BlogDao blogDao) {
        this.blogDao = blogDao;
    }

    public void init(){
        if (null == blogDao) {
            throw new IllegalStateException("The [blogDao] must be set..");
        }
    }

    public void destroy(){}
}
