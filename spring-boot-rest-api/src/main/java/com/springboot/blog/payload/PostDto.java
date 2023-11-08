package com.springboot.blog.payload;

import com.springboot.blog.entity.Post;
import lombok.*;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private Long id;

    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;

    @NotEmpty
    @Size(min = 10, message = "Post description should have at least 2 characters")
    private String description;

    @NotEmpty
    private String contents;
    private Set<CommentDto> comments;

}
