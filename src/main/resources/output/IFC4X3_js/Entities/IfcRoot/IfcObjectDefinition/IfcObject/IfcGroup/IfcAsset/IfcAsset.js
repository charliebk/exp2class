class IfcAsset extends IfcGroup {
    constructor() {
        /** @type {IFCIDENTIFIER} */
        this.Identification = null;
        /** @type {IFCCOSTVALUE} */
        this.OriginalValue = null;
        /** @type {IFCCOSTVALUE} */
        this.CurrentValue = null;
        /** @type {IFCCOSTVALUE} */
        this.TotalReplacementCost = null;
        /** @type {IFCACTORSELECT} */
        this.Owner = null;
        /** @type {IFCACTORSELECT} */
        this.User = null;
        /** @type {IFCPERSON} */
        this.ResponsiblePerson = null;
        /** @type {IFCDATE} */
        this.IncorporationDate = null;
        /** @type {IFCCOSTVALUE} */
        this.DepreciatedValue = null;
    }
}
