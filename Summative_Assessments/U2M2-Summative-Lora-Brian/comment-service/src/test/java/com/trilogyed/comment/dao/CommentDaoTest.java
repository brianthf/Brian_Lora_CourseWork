package com.trilogyed.comment.dao;

import com.trilogyed.comment.model.Comment;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

public class CommentDaoTest {

    @Autowired
    CommentDao commentDao;

    @Before
    public void setUp() throws Exception {
        List<Comment> comments = commentDao.getAllComments();
        for (Comment c : comments) {
            commentDao.deleteComment(c.getCommentId());
        }
    }

    @Test
    public void addGetDeleteComment() {
        Comment comment = new Comment();
        comment.setPostId(1);
        comment.setCreateDate(LocalDate.of(2019, 12,11));
        comment.setCommenterName("Morpheus");
        comment.setComment("I am morpheus and I approve this message.");
        comment = commentDao.addComment(comment);

        Comment comment1 = commentDao.getComment(comment.getCommentId());
        assertEquals(comment1, comment);

        commentDao.deleteComment(comment.getCommentId());
        comment1 = commentDao.getComment(comment.getCommentId());
        assertNull(comment1);
    }


    @Test
    public void getAllComments() {
        Comment comment = new Comment();
        comment.setPostId(1);
        comment.setCreateDate(LocalDate.of(2019, 12,11));
        comment.setCommenterName("Morpheus");
        comment.setComment("I am morpheus and I approve this message.");
        comment = commentDao.addComment(comment);

        List<Comment> comments = commentDao.getAllComments();
        assertEquals(1, comments.size());
    }

    @Test
    public void getCommentsByCommenter() {
        Comment comment = new Comment();
        comment.setPostId(1);
        comment.setCreateDate(LocalDate.of(2019, 12,11));
        comment.setCommenterName("Morpheus");
        comment.setComment("I am morpheus and I approve this message.");
        comment = commentDao.addComment(comment);

        List<Comment> comments = commentDao.getCommentsByCommenter(comment.getCommenterName());
        assertEquals(1, comments.size());
    }

    @Test
    public void updateComment() {
        Comment comment = new Comment();
        comment.setPostId(1);
        comment.setCreateDate(LocalDate.of(2019, 12,11));
        comment.setCommenterName("Morpheus");
        comment.setComment("I am morpheus and I approve this message.");
        comment = commentDao.addComment(comment);

        comment.setComment("I changed my mind, this message is trash.");

        Comment comment1 = commentDao.getComment(comment.getCommentId());
        assertEquals(comment1, comment);
    }

}