class IfcSchedulingTime:
    def __init__(self):
        self.Name: IfcLabel = None
        self.DataOrigin: IfcDataOriginEnum = None
        self.UserDefinedDataOrigin: IfcLabel = None

    # === EXTENDED BY ===
    # IfcEventTime
    # IfcLagTime
    # IfcResourceTime
    # IfcTaskTime
    # IfcWorkTime
