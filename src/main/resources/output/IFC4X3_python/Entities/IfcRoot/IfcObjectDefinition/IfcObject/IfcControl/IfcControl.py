class IfcControl(IfcObject):
    def __init__(self):
        self.Identification: IfcIdentifier = None

    # === EXTENDED BY ===
    # IfcActionRequest
    # IfcCostItem
    # IfcCostSchedule
    # IfcPerformanceHistory
    # IfcPermit
    # IfcProjectOrder
    # IfcWorkCalendar
    # IfcWorkControl

    # === INVERSE CLAUSES ===
    # Controls : SET [0:?] OF IfcRelAssignsToControl FOR RelatingControl
