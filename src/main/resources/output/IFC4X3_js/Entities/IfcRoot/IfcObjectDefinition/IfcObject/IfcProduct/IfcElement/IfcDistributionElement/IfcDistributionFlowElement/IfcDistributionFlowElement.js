class IfcDistributionFlowElement extends IfcDistributionElement {
    constructor() {
        // no parameters
    }

    // === EXTENDED BY ===
    // IfcDistributionChamberElement
    // IfcEnergyConversionDevice
    // IfcFlowController
    // IfcFlowFitting
    // IfcFlowMovingDevice
    // IfcFlowSegment
    // IfcFlowStorageDevice
    // IfcFlowTerminal
    // IfcFlowTreatmentDevice

    // === INVERSE CLAUSES ===
    // HasControlElements : SET [0:1] OF IfcRelFlowControlElements FOR RelatingFlowElement
}
