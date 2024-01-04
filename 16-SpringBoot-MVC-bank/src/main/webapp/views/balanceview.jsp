<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head> 
        <style> 
        .hope {
            text-align: center;
            margin: 200px;
        }
        button {
            font-size: 30px;
        }
    </style>
</head>
    <body>

        <h1 style="color: blue;">Display Bank Balance</h1>
        <table border="1">
            <tr>
                <th>Account Number</th>
                <th>Amount</th>
                <th>Name</th>
                <th>Password</th>
                <th>Mobile Number</th>
                <th>Status</th>
                <th>Deposit</th>
                <th>Withdraw</th>
            </tr>
            <tr>
                <td>${bank.account_number}</td>
                <td>${bank.amount}</td>
                <td>${bank.name}</td>
                <td>${bank.password}</td>
                <td>${bank.mobilenum}</td>
                <td>${bank.status}</td>
                <td><a href="/depo2 "><button>Deposit</button></a></td>
                <td><a href="/withdraw"><button>Withdraw</button></a></td>
            </tr>
        </table>

        <div class="hope">
            <a href="/"><button>Home</button></a>
            <a href="/newacc"><button>New Account</button></a>
            <a href="/balance"><button>Balance</button></a>
            <a href="/depo2"><button>Deposit</button></a>
            <a href="/withdraw"><button>Withdraw</button></a>
            <a href="/transfer"><button>Transfer</button></a>
            <a href="/close"><button>Close A/C</button></a>
            <a href="/about"><button>About</button></a>
        </div> 
    </body>
</html>
