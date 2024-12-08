const Task = require("../models/Task");
const express = require("express");

// Créer un nouvel Task
exports.createTask= async (req, res) => {
    try {
      const Task = new Task(req.body);
      awaitTask.save();
      res.status(201).json(Task);
    } catch (error) {
      res.status(500).json({ message: error.message });
    }
  };
  

  

  
  // Mettre à jour un Task existant
  exports.updateTask = async (req, res) => {
    try {
      const Task = await Task.findByIdAndUpdate(req.params.id, req.body, { new: true });
      if (!Task) {
        return res.status(404).json({ message: 'Task not found' });
      }
      res.json(Task);
    } catch (error) {
      res.status(500).json({ message: error.message });
    }
  };
  
  exports.deleteTask = async (req, res) => {
    try {
      const Task = await Task.findByIdAndDelete(req.params.id);
      if (!Task) {
        return res.status(404).json({ message: 'Task not found' });
      }
      res.json({ message: 'Task deleted successfully' });
    } catch (error) {
      res.status(500).json({ message: error.message });
    }
  };
  