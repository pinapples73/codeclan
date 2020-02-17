import Vue from 'vue';

document.addEventListener('DOMContentLoaded', () => {
  new Vue ({
    el: "#app",
    data: {
      todoList: [{
        task: "Get out of bed",
        priority: "medium"
      },
      {
        task: "Really get out of bed",
        priority: "high"
      },
      {
        task: "Brush Teeth",
        priority: "low"
      }
    ],
      newTask: "",
      newPriority: ""
    },
    methods: {
      addNewtask: function() {
        this.todoList.push({
          task: this.newTask,
          priority: this.newPriority
        })
        this.newTask="",
        this.newPriority=""
      }
    }
  })
})
