/*

3. Solve this.
Fresh business scenario to apply inheritance , polymorphism n 
abstraction to emp based organization scenario.

Create Emp based organization structure --- Emp , Mgr , Worker
All of above classes must be in --com.app.org

3.1 Emp state--- id(int), firstName, lastName , deptId , basic(double)
emp id MUST be automatically generated.

Behaviour ---1.  get emp details -- using toString.

2. compute net salary 

3.2 Mgr state  ---id,name,basic,deptId , perfBonus
Behaviour ----1. get mgr details :  using toString. 
2. compute net salary (formula: basic+perfBonus) -- override computeNetSalary
3. get performance bonus. --add a new method to return bonus.(getter)

n
3.3 Worker state  --id,name,basic,deptId,hoursWorked,hourlyRate
Behaviour--- 
1. get worker details -- :  override toString.
2.  compute net salary (formula:  = basic+(hoursWorked*hourlyRate) --override computeNetSalary
3. get hrlyRate of the worker  -- add a new method to return hourly rate of a worker.(getter)

Organize classes in inheritance  hierarchy.

NOTE : toString method SHOULD NOT include the net salary of the employee

Write TestOrganization in "tester" package.
Create suitable array to store organization details.
Provide following options

*/