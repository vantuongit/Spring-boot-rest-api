package com.springboot.blog.services;

import com.springboot.blog.entity.Comment;
import com.springboot.blog.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);
    List<CommentDto> getCommentsByPostId(long postId);
    CommentDto getCommentsById(long postId, long commentId);
    CommentDto updateComment(long postId, long commentId, CommentDto commentRequest);

    void deleteComment(long postId, long commentId);

}
