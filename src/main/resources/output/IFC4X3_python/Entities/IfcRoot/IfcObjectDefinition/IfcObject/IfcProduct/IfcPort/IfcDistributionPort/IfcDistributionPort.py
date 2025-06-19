class IfcDistributionPort(IfcPort):
    def __init__(self):
        self.FlowDirection: IfcFlowDirectionEnum = None
        self.PredefinedType: IfcDistributionPortTypeEnum = None
        self.SystemType: IfcDistributionSystemEnum = None
