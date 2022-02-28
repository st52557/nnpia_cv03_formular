<h1>First Spring Boot application</h1>

This application contains few simple endpoints for learning purposes.

<div style="font-size: larger">
    <li>GET /welcome/{name} - say hello to someone.</li>
    <li>GET /index - returns form</li>
    <li>POST /index - sends new question trough form</li>

Form on /index returns different value based on first letter of send message. It is case-sensitive.
</div>

<h4>Payload for POST /index</h4>

<code>
{<br>
    "name": "Ryland Grace",<br>
    "email": "grace@mary.com",<br>
    "msg": "This is a message."<br>
}
</code>
