import schedule
import time
from datetime import datetime
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart
import textwrap

sender = "roshanpalani09@gmail.com"
receiver = "deekshiroshan@gmail.com"

def send_report():
    currenttime = datetime.now().strftime("%Y-%m-%d %H:%M:%S")

    message = MIMEMultipart()
    message["Subject"] = "Daily Automation Report"
    message["From"] = sender
    message["To"] = receiver

    reportbody = textwrap.dedent(f"""
    Hello Team,

    🕒 Report Generated: {currenttime}

    ✅ Files processed successfully
    ✅ No errors encountered
    ✅ All systems running smoothly

    Regards,
    Python Automation Bot 🤖
    """)
    message.attach(MIMEText(reportbody, "plain"))

    print("Simulated Report Sent")
    print("-" * 60)
    print(message.as_string()[:400] + "\n...report truncated")
    print("-" * 60)

# ✅ Schedule the report
schedule.every(1).minutes.do(send_report)

print("🚀 Automated Email Report Sender started (Simulation Mode)")
print("🕒 Reports will be generated at scheduled intervals (demo runs below).")

# ✅ Demo Mode: run it instantly 3 times
for _ in range(5):
    send_report()  # <--- run immediately for testing
    time.sleep(2)  # short pause to simulate time gap

print("✅ Simulation complete. In real use, this would run continuously.")
