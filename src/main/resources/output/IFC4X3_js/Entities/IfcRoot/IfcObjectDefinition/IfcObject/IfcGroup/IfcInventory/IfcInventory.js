class IfcInventory extends IfcGroup {
    constructor() {
        /** @type {IFCINVENTORYTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCACTORSELECT} */
        this.Jurisdiction = null;
        /** @type {SET [1:?] OF IFCPERSON} */
        this.ResponsiblePersons = null;
        /** @type {IFCDATE} */
        this.LastUpdateDate = null;
        /** @type {IFCCOSTVALUE} */
        this.CurrentValue = null;
        /** @type {IFCCOSTVALUE} */
        this.OriginalValue = null;
    }
}
