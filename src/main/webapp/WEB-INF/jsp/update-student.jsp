<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <title>Update Student</title>

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
        padding: 20px 25px;
        border-radius: 8px;
        box-shadow: 0 3px 10px rgba(0, 0, 0, 0.1);
        width: 300px;
      }

      h2 {
        text-align: center;
        margin-bottom: 15px;
      }

      form {
        display: flex;
        flex-direction: column;
      }

      input {
        margin-bottom: 10px;
        padding: 7px;
        border: 1px solid #ccc;
        border-radius: 4px;
      }

      button {
        padding: 8px;
        background-color: #4a90e2;
        color: white;
        border: none;
        border-radius: 4px;
        cursor: pointer;
      }

      button:hover {
        background-color: #357abd;
      }
    </style>
  </head>

  <body>
    <div class="container">
      <h2>Update Student</h2>

      <form action="/students/update-form" method="post">
        <input type="hidden" name="id" value="${student.id}" />

        <input
          type="text"
          name="name"
          value="${student.name}"
          placeholder="Name"
        />
        <input
          type="text"
          name="email"
          value="${student.email}"
          placeholder="Email"
        />
        <input
          type="number"
          name="courseId"
          value="${student.course.id}"
          placeholder="Course ID"
        />

        <button type="submit">Update</button>
      </form>
    </div>
  </body>
</html>
