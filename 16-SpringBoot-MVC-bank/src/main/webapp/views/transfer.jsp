<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>TransferAmount</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    <style>
        body {
            background-image: url('deposit.jpg');
            background-repeat: no-repeat;
            background-size: cover;
        }

        .nav-link {
            margin-right: 10px; /* Adjust the margin as needed */
        }
        
        .form-container {
            background-color: rgba(255, 255, 255, 0.8); /* Semi-transparent white */
            padding: 20px;
            border-radius: 15px;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="container mt-3">
        <h1 class="text-center text-danger">SDFC BANK</h1>
        <marquee style="background-color: red; color: white;"><b>TRANSFER YOUR MONEY FROM ONE ACCOUNT TO ANOTHER THROUGH BELOW FORM...............THANK YOU</b></marquee>

        <nav class="nav justify-content-center">
            <a href="/" class="nav-link btn-primary">Home</a>
            <a href="/newacc" class="nav-link btn-primary">New Account</a>
            <a href="/balance" class="nav-link btn-primary">Balance</a>
            <a href="/depo2" class="nav-link btn-primary">Deposit</a>
            <a href="/withdraw" class="nav-link btn-primary">Withdraw</a>
            <a href="/transfer" class="nav-link btn-primary">Transfer</a>
            <a href="/close" class="nav-link btn-primary">Close A/C</a>
            <a href="/about" class="nav-link btn-primary">About</a>
        </nav>

        <div class="form-container">
            <h2 class="text-center">Transfer Amount Form</h2>
            <form action="/transferamount" class="was-validated">
                <div class="form-group">
                    <label for="senderAccountNumber">Sender Account Number:</label>
                    <input type="text" class="form-control" id="senderAccountNumber" placeholder="Enter Sender Account Number" name="senderAccountNumber" required>
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" class="form-control" id="password" placeholder="Enter Your Password" name="password" required>
                </div>
                <div class="form-group">
                    <label for="receiverAccountNumber">Beneficiary Account Number:</label>
                    <input type="text" class="form-control" id="receiverAccountNumber" placeholder="Enter Beneficiary Account Number" name="receiverAccountNumber" required>
                </div>
                <div class="form-group">
                    <label for="amount">Amount:</label>
                    <input type="text" class="form-control" id="amount" placeholder="Enter Amount" name="amount" required>
                </div>
                <div class="text-center">
                    <button type="submit" class="btn btn-primary">Submit</button>
                    <button type="reset" class="btn btn-secondary">Clear</button>
                </div>
            </form>
        </div>
    </div>

    <!-- Bootstrap JS and Popper.js (Optional) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
