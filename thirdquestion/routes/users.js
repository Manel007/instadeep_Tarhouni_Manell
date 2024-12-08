var express = require('express');
var router = express.Router();
var {createTask,updateTask,deleteTask} = require('../controllers/taskController'); // Fonction de création de notifications

/* GET users listing. */
router.get('/', function(req, res, next) {
  res.send('respond with a resource');
});
router.post("/createTask",createTask);
//router.put("/updateTask",updateTask);
router.delete("/deleteTask",deleteTask);



module.exports = router;
