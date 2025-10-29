# Importing required libraries
# → Provides functions to connect to an SMTP server and send emails.
import smtplib

# → Allows us to create a plain-text email message.
from email.mime.text import MIMEText

# → Allows us to create emails with multiple parts (e.g., plain text + HTML)
from email.mime.multipart import MIMEMultipart
from reprlib import recursive_repr

# Placeholder email details (for demonstration)
sendermail = "roshanpalani09@gmail.com"
recievermail = "deekshiroshan@gmail.com"
password = "rodeeks"

# Create an email message object
message = MIMEMultipart("alternative")
message["Subject"] = "Automated Tested Mail"
message["From"] = sendermail
message["To"] = recievermail

# Define the email body
text = """\
Hello,

This is a demo email created for Python Automation learning.
(No actual email is being sent in this example.)

Best Regards,
Automation Bot 🤖
"""
# Attach the message body to the email object
message.attach(MIMEText(text, "plain"))

# Demonstrate the concept
print("📧 Email object created successfully (Demo Mode)!")
print("📝 Email Preview (truncated):")
print("-" * 50)
print(message.as_string()[:300] + "\n... (message truncated)")
print("-" * 50)
print("✅ Email ready to be sent using smtplib (simulation mode).")

# Real Email Sending (Do NOT run with placeholders)
