package com.test.springai.controller;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ai")
public class AiController {

    private final OllamaChatModel chatModel;

    public AiController(OllamaChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @PostMapping("/chat")
    public String chat(@RequestBody String prompt) {
        return chatModel.call(prompt);
    }
}
