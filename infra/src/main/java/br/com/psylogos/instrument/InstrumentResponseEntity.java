package br.com.psylogos.instrument;

import br.com.psylogos.infra.game.GameStateEntity;
import br.com.psylogos.infra.panas.PanasResponseEntity;
import br.com.psylogos.infra.sam.SamResponseEntity;
import br.com.psylogos.infra.screen.ScreenTimeEntryEntity;
import core.data.InstrumentResponse;
import core.enums.InstrumentTypeEnum;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@Data
@Entity
@Table(schema = "psylogos", name = "tb_instrument_response")
public class InstrumentResponseEntity {

    public InstrumentResponseEntity(InstrumentResponse instrumentResponse) {
        this.timestamp = instrumentResponse.getTimestamp();
        this.pingDay = instrumentResponse.getPingDay();
        this.pingIndex = instrumentResponse.getPingIndex();
        this.type = instrumentResponse.getType();
        this.sam = new SamResponseEntity(instrumentResponse.getSam());
        this.wasWatchingFeed = instrumentResponse.getWasWatchingFeed();
        this.panas = new PanasResponseEntity(instrumentResponse.getPanas());
        this.sleepQuality = instrumentResponse.getSleepQuality();
        this.stressfulEvents = instrumentResponse.getStressfulEvents();
        this.screenTimeLog = Arrays.stream(instrumentResponse.getScreenTimeLog())
                .map(ScreenTimeEntryEntity::new)
                .collect(Collectors.toList());
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "timestamp")
    private LocalDateTime timestamp;

    @Column(name = "ping_day")
    private Integer pingDay;

    @Column(name = "ping_index")
    private Integer pingIndex;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private InstrumentTypeEnum type;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private SamResponseEntity sam;

    @Column(name = "was_watching_feed")
    private Boolean wasWatchingFeed;

    @ManyToOne(fetch = FetchType.LAZY)
    private PanasResponseEntity panas;

    @Column(name = "sleep_quality")
    private Integer sleepQuality;

    @Column(name = "stressful_event")
    private String stressfulEvents;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ScreenTimeEntryEntity> screenTimeLog;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private GameStateEntity gameState;
}
