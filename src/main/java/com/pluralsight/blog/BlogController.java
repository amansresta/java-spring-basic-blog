package com.pluralsight.blog;

import com.pluralsight.blog.data.PostRepository;
import com.pluralsight.blog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BlogController {

    private PostRepository postRepository;

    public BlogController(PostRepository p) {
        this.postRepository = p;
    }

    @RequestMapping("/")
    public String listPosts(ModelMap m) {
        List<Post> listPost = postRepository.getAllPosts();
        m.put("posts", listPost);
        return "home";
    }



}
