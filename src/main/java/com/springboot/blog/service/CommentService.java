package com.springboot.blog.service;

import com.springboot.blog.dto.CommentDto;

public interface CommentService {
    CommentDto createComment(long postId,CommentDto commentDto);
}
