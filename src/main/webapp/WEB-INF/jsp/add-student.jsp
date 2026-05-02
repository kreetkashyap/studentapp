<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <title>Add Student</title>

    <style>
      body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f8;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
      }

      .container {
        background: white;
        padding: 25px 30px;
        border-radius: 10px;
        box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
        width: 300px;
      }

      h2 {
        text-align: center;
        margin-bottom: 20px;
      }

      form {
        display: flex;
        flex-direction: column;
      }

      input {
        margin-bottom: 12px;
        padding: 8px;
        border: 1px solid #ccc;
        border-radius: 5px;
        font-size: 14px;
      }

      input:focus {
        outline: none;
        border-color: #4a90e2;
      }

      button {
        padding: 10px;
        background-color: #4a90e2;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 15px;
      }

      button:hover {
        background-color: #357abd;
      }
    </style>
  </head>

  <body>
    <div class="container">
      <h2>Add Student</h2>

      <form action="/students/add-form" method="post">
        <input type="text" name="name" placeholder="Enter Name" required />
        <input type="text" name="email" placeholder="Enter Email" required />
        <input type="number" name="courseId" placeholder="Course ID" required />

        <button type="submit">Add Student</button>
      </form>
    </div>
  </body>
</html>
