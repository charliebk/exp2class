class IfcDistributionControlElement extends IfcDistributionElement {
    constructor() {
        // no parameters
    }

    // === EXTENDED BY ===
    // IfcActuator
    // IfcAlarm
    // IfcController
    // IfcFlowInstrument
    // IfcProtectiveDeviceTrippingUnit
    // IfcSensor
    // IfcUnitaryControlElement

    // === INVERSE CLAUSES ===
    // AssignedToFlowElement : SET [0:1] OF IfcRelFlowControlElements FOR RelatedControlElements
}
