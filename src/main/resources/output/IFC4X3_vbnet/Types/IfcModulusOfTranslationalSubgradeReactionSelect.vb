' SELECT TYPE IfcModulusOfTranslationalSubgradeReactionSelect
' Options:
' - IfcBoolean
' - IfcModulusOfLinearSubgradeReactionMeasure
Public Class IfcModulusOfTranslationalSubgradeReactionSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcBoolean OrElse TypeOf value Is IfcModulusOfLinearSubgradeReactionMeasure) Then
            Throw New ArgumentException("Value must be one of: IfcBoolean, IfcModulusOfLinearSubgradeReactionMeasure")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
