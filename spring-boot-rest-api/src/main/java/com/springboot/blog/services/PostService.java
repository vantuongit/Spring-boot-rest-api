package com.springboot.blog.services;

import com.springboot.blog.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    List<PostDto> getAllPosts(int pageNo, int pageSize);
    PostDto getPostById(Long id);
    PostDto updatePost(PostDto postDto, long id);
    void deletePostById(long id);

}
