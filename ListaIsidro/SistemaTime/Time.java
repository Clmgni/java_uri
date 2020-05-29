public class Time {
    private int hora;
    private int minuto;
    private int segundo;

    public void setTime(int hora, int minuto, int segundo){
        this.hora    = hora;
        this.minuto  = minuto;
        this.segundo = segundo;
    }

    public String exibirHoraUniversal(){
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }

    public String exibirHoraPadrao(){
        String  periodo         = this.hora >= 0 && this.hora < 12 ? " AM" : " PM";
        int     horaConvertida  = this.hora >= 0 && this.hora <= 12 ? this.hora : this.hora - 12;

        return horaConvertida + ":" + minuto + ":" + segundo + periodo;
    }
}