class IfcPort extends IfcProduct {
    constructor() {
        // no parameters
    }

    // === EXTENDED BY ===
    // IfcDistributionPort

    // === INVERSE CLAUSES ===
    // ContainedIn : SET [0:1] OF IfcRelConnectsPortToElement FOR RelatingPort
    // ConnectedFrom : SET [0:1] OF IfcRelConnectsPorts FOR RelatedPort
    // ConnectedTo : SET [0:1] OF IfcRelConnectsPorts FOR RelatingPort
}
