<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Balance - SDFC BANK</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    <style>
        body {
            background-image: url('balance.jpg');
            background-repeat: no-repeat;
            background-size: cover;
        }
        .form-container {
            background-color: rgba(255, 255, 255, 0.8);
            padding: 20px;
            border-radius: 15px;
            margin-top: 20px;
        }
        .nav-link {
            margin-right: 10px;
        }
    </style>
</head>
<body>
    <div class="container text-center mt-5">
        <h1 class="text-danger mb-4">SDFC BANK</h1>
        <marquee style="color: black;"><b>Fill The Below Form To Know Your Bank Account Balance..........Thank You</b></marquee>

        <div class="my-4">
            <a href="/" class="btn btn-primary">Home</a>
            <a href="/newacc" class="btn btn-primary">New Account</a>
            <a href="/balance" class="btn btn-primary">Balance</a>
            <a href="/depo2" class="btn btn-primary">Deposit</a>
            <a href="/withdraw" class="btn btn-primary">Withdraw</a>
            <a href="/transfer" class="btn btn-primary">Transfer</a>
            <a href="/close" class="btn btn-primary">Close A/C</a>
            <a href="/about" class="btn btn-primary">About</a>
        </div>

        <div class="form-container mx-auto">
            <h2 class="text-black mb-4">Know Your Balance</h2>

            <form action="/getbalance" onsubmit="return validateForm()">
                <div class="form-group">
                    <label for="accountNumber">Account Number:</label>
                    <input type="text" class="form-control input-small" id="accountNumber" name="account_number" placeholder="Enter Your Account Number">
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" class="form-control input-small" id="password" name="password" placeholder="Enter Your Password">
                </div>
                <button type="submit" class="btn btn-success">Submit</button>
                <button type="reset" class="btn btn-secondary">Clear</button>
            </form>
        </div>
    </div>

    <!-- Bootstrap JS and Popper.js -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    <script>
        function validateForm() {
            var accountNumber = document.getElementById("accountNumber").value;
            var password = document.getElementById("password").value;

            if (accountNumber === "" || password === "") {
                alert("Please fill in all fields.");
                return false;
            }
            return true;
        }
    </script>
</body>
</html>
