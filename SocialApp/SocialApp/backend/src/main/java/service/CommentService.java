package service;



import common.InvalidOperationException;
import entity.Comment;
import entity.Post;
import response.CommentResponse;

import java.util.List;

public interface CommentService {
    Comment getCommentById(Long commentId);
    Comment createNewComment(String content, Post post);
    Comment updateComment(Long commentId, String content) throws InvalidOperationException;
    Comment likeComment(Long commentId) throws InvalidOperationException;
    Comment unlikeComment(Long commentId) throws InvalidOperationException;
    void deleteComment(Long commentId) throws InvalidOperationException;
    List<CommentResponse> getPostCommentsPaginate(Post post, Integer page, Integer size);
}