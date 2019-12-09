package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    //This method calls the addComment() method in Repository and passes the comment to be persisted in database with particular image
    public Comment addComment(Comment comment) {
        return commentRepository.addComment(comment);
    }
}
