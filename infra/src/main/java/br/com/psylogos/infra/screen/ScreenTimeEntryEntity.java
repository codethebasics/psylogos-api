package br.com.psylogos.infra.screen;

import core.data.ScreenTimeEntry;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(schema = "psylogos", name = "tb_screen_time_entry")
public class ScreenTimeEntryEntity {

    public ScreenTimeEntryEntity(ScreenTimeEntry screenTimeEntry) {
       this.platform = screenTimeEntry.getPlatform();
       this.otherPlatformDetails = screenTimeEntry.getOtherPlatformDetails();
       this.duration = screenTimeEntry.getDuration();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "platform")
    private String platform;

    @Column(name = "other_platform_details")
    private String otherPlatformDetails;

    @Column(name = "duration")
    private String duration;
}
