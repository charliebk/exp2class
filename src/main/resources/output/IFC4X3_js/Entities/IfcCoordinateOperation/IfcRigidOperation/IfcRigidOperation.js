class IfcRigidOperation extends IfcCoordinateOperation {
    constructor() {
        /** @type {IFCMEASUREVALUE} */
        this.FirstCoordinate = null;
        /** @type {IFCMEASUREVALUE} */
        this.SecondCoordinate = null;
        /** @type {IFCLENGTHMEASURE} */
        this.Height = null;
    }

    // === WHERE CLAUSES ===
    // SameCoordinateType : (('IFC4X3_DEV_73740fe4.IFCLENGTHMEASURE' IN TYPEOF(FirstCoordinate)) AND ('IFC4X3_DEV_73740fe4.IFCLENGTHMEASURE' IN TYPEOF(SecondCoordinate))) OR (('IFC4X3_DEV_73740fe4.IFCPLANEANGLEMEASURE' IN TYPEOF(FirstCoordinate)) AND ('IFC4X3_DEV_73740fe4.IFCPLANEANGLEMEASURE' IN TYPEOF(SecondCoordinate)))
}
