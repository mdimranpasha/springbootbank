
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Error Page</title>
    <!-- Add link to your CSS files if needed -->
</head>
<body>
    <div class="container">
        <h1>Error</h1>
        <p th:text="${error}">Error message goes here.</p>
        <a href="/">Go Back to Home</a>
    </div>
</body>
</html>
