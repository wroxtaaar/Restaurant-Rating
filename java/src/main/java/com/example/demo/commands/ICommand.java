package com.example.demo.commands;

import java.util.List;

public interface ICommand {
    void execute(List<String> tokens);
    
}