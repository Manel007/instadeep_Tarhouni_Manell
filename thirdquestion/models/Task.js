const mongoose = require('mongoose');
const { Schema } = mongoose;
const Task = new Schema({
  Title: String,
  description: String,
  Priority: String,
  Category: String,
  Due_Date: String,
  Completion_Status: String,


});
module.exports = mongoose.model('Task', Task);