class IfcRelSpaceBoundary extends IfcRelConnects {
    constructor() {
        /** @type {IFCSPACEBOUNDARYSELECT} */
        this.RelatingSpace = null;
        /** @type {IFCELEMENT} */
        this.RelatedBuildingElement = null;
        /** @type {IFCCONNECTIONGEOMETRY} */
        this.ConnectionGeometry = null;
        /** @type {IFCPHYSICALORVIRTUALENUM} */
        this.PhysicalOrVirtualBoundary = null;
        /** @type {IFCINTERNALOREXTERNALENUM} */
        this.InternalOrExternalBoundary = null;
    }

    // === EXTENDED BY ===
    // IfcRelSpaceBoundary1stLevel

    // === WHERE CLAUSES ===
    // CorrectPhysOrVirt : ((PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.Physical) AND (NOT('IFC4X3_DEV_73740fe4.IFCVIRTUALELEMENT' IN TYPEOF(RelatedBuildingElement)))) OR ((PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.Virtual) AND (('IFC4X3_DEV_73740fe4.IFCVIRTUALELEMENT' IN TYPEOF(RelatedBuildingElement)) OR   ('IFC4X3_DEV_73740fe4.IFCOPENINGELEMENT' IN TYPEOF(RelatedBuildingElement)))) OR (PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.NotDefined)
}
