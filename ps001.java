class Employee{
    def __init__(self, employee_id, first_name, last_name, address);
        {
        self.id = employee_id
        self.first_name = first_name
        self.last_name = last_name
        self.address = address
        }
    def display_details(self):
        """
        Display the details of the employee.
        """
        print(f"Employee ID: {self.id}")
        print(f"First Name: {self.first_name}")
        print(f"Last Name: {self.last_name}")
        print(f"Address: {self.address}")

    def update_address(self, new_address):
        """
        Update the address of the employee.

        :param new_address: New address of the employee
        """
        self.address = new_address
        print("Address updated successfully!")

}