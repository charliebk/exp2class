' SELECT TYPE IfcSimpleValue
' Options:
' - IfcBinary
' - IfcBoolean
' - IfcDate
' - IfcDateTime
' - IfcDuration
' - IfcIdentifier
' - IfcInteger
' - IfcLabel
' - IfcLogical
' - IfcPositiveInteger
' - IfcReal
' - IfcText
' - IfcTime
' - IfcTimeStamp
' - IfcURIReference
Public Class IfcSimpleValue
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcBinary OrElse TypeOf value Is IfcBoolean OrElse TypeOf value Is IfcDate OrElse TypeOf value Is IfcDateTime OrElse TypeOf value Is IfcDuration OrElse TypeOf value Is IfcIdentifier OrElse TypeOf value Is IfcInteger OrElse TypeOf value Is IfcLabel OrElse TypeOf value Is IfcLogical OrElse TypeOf value Is IfcPositiveInteger OrElse TypeOf value Is IfcReal OrElse TypeOf value Is IfcText OrElse TypeOf value Is IfcTime OrElse TypeOf value Is IfcTimeStamp OrElse TypeOf value Is IfcURIReference) Then
            Throw New ArgumentException("Value must be one of: IfcBinary, IfcBoolean, IfcDate, IfcDateTime, IfcDuration, IfcIdentifier, IfcInteger, IfcLabel, IfcLogical, IfcPositiveInteger, IfcReal, IfcText, IfcTime, IfcTimeStamp, IfcURIReference")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
