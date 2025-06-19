class IfcDistributionControlElement(IfcDistributionElement):
    def __init__(self):
        pass

    # === EXTENDED BY ===
    # IfcActuator
    # IfcAlarm
    # IfcController
    # IfcFlowInstrument
    # IfcProtectiveDeviceTrippingUnit
    # IfcSensor
    # IfcUnitaryControlElement

    # === INVERSE CLAUSES ===
    # AssignedToFlowElement : SET [0:1] OF IfcRelFlowControlElements FOR RelatedControlElements
