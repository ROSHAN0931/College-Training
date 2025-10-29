# SCHEDULING TASKS IN PYTHON
# Step 1️⃣: Install the schedule library (uncomment if not installed)
# !pip install schedule

# Step 2️⃣: Import required libraries
import schedule        # For scheduling jobs at specific intervals
import time            # To pause the program between checks
from datetime import datetime  # To display the current timestamp

# Step 3️⃣: Define a simple task
def job():
    print(f"⏰ Scheduled Task executed at: {datetime.now()}")

# Step 4️⃣: Schedule the task to run every 1 minute
schedule.every(1).minutes.do(job)

print("✅ Scheduler initialized. Task is scheduled to run every 1 minute.")

# Step 5️⃣: Run the scheduler safely in notebook
# In Colab or Jupyter, running an infinite loop can freeze the notebook.
# To demonstrate scheduling safely, we'll run the task a few times manually.
# This simulates scheduled execution without causing issues.

for _ in range(3):  # Run the scheduled check 3 times
    schedule.run_pending()  # Check and run pending tasks
    time.sleep(1)           # Pause briefly to simulate scheduling

print("ℹ️ Demo complete. In a real scenario, the scheduler would run continuously.")